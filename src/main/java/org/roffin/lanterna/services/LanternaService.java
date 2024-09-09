package org.roffin.lanterna.services;

import java.io.IOException;

import org.roffin.lanterna.gui.SampleWindow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.DefaultWindowManager;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

@Service
public class LanternaService {

    private static final Logger LOG = LoggerFactory.getLogger(LanternaService.class);

    public void boot() throws IOException {
        LOG.info("Init GUI");

        // Setup terminal and screen layers
        Terminal terminal = new DefaultTerminalFactory().createTerminal();
        Screen screen = new TerminalScreen(terminal);
        screen.startScreen();

        // Create gui and start gui
        MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(),
                new EmptySpace(TextColor.ANSI.BLACK));

        // Create window to hold the panel
        SampleWindow window = new SampleWindow(gui);

        gui.addWindowAndWait(window);
    }

}
