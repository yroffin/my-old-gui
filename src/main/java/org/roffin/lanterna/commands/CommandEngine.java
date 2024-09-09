package org.roffin.lanterna.commands;

import java.io.IOException;

import org.roffin.lanterna.services.LanternaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class CommandEngine {

    @Autowired
    LanternaService lanternaService;

    @ShellMethod(key = "demo")
    public String helloWorld(
            @ShellOption(defaultValue = "spring") String arg) throws IOException, InterruptedException {

        lanternaService.boot();
        return "Hello world " + arg;
    }

}
