// Experiment 8(a): Simple applet program (legacy syllabus example)
// Applets are obsolete. This source is intended for record/exam study.
// Use a JDK 8 environment with appletviewer for the traditional demonstration.
import java.applet.Applet;
import java.awt.Graphics;

@SuppressWarnings("removal")
public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Welcome to Java Applet", 50, 50);
    }
}

/*
Legacy HTML file (for old appletviewer environments):
<applet code="SimpleApplet.class" width="300" height="150">
</applet>
*/
