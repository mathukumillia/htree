import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.JFrame;
import java.awt.event.*;

class rTriangleWindow extends JFrame implements MouseListener {
	
	private HTree tree = null;
	
	// double buffering objects
	// used to eliminate flicker when resizing window
    private Image offscreen; 
	private Graphics buffer;
}