package org.roffin.lanterna.gui;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Button;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.GridLayout;
import com.googlecode.lanterna.gui2.Label;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.TextBox;
import com.googlecode.lanterna.gui2.dialogs.MessageDialog;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogButton;

public class SampleWindow extends BasicWindow {
    public SampleWindow(MultiWindowTextGUI gui) {
        super("WindowTitle");

        // Create panel to hold components
        Panel panel = new Panel();
        panel.setLayoutManager(new GridLayout(8));

        panel.addComponent(new Label("Forename"));
        panel.addComponent(new TextBox());

        panel.addComponent(new Label("Surname"));
        panel.addComponent(new TextBox());

        panel.addComponent(new EmptySpace(new TerminalSize(0, 0))); // Empty space underneath labels
        panel.addComponent(new Button("Submit"));

        panel.addComponent(new Label("Button (centered)"));
        panel.addComponent(new Button("Button", new Runnable() {
            @Override
            public void run() {
                MessageDialog.showMessageDialog(gui, "MessageBox", "This is a message box", MessageDialogButton.OK);
            }
        }).setLayoutData(GridLayout.createLayoutData(GridLayout.Alignment.CENTER, GridLayout.Alignment.CENTER)));

        this.setComponent(panel);
    }
}
