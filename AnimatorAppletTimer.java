import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnimatorAppletTimer extends Frame
{
	Button cutButton,copyButton,pasteButton,deleteButton;
	public AnimatorAppletTimer()
	{
		super("ToolBar Example(AWT)");
		setSize(450,250);
		addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent e)
					{
						System.exit(0);
					}
				});
		ActionListener printListener=new ActionListener()
				{
					public void actionPerformed(ActionEvent ae)
					{
						System.out.println(ae.getActionCommand());
					}
				};
				Panel toolbar=new Panel();
				toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));
				
				cutButton=new Button("Cut");
				cutButton.addActionListener(printListener);
				toolbar.add(cutButton);
				
				copyButton=new Button("Copy");
				copyButton.addActionListener(printListener);					
				toolbar.add(copyButton);
				
				pasteButton=new Button("Paste");
				pasteButton.addActionListener(printListener);
				toolbar.add(pasteButton);
				
				deleteButton=new Button("Delete");
				deleteButton.addActionListener(printListener);
				toolbar.add(deleteButton);
				
				add(toolbar,BorderLayout.NORTH);
				
	}
	public static void main(String[] args)
	{
		AnimatorAppletTimer at=new AnimatorAppletTimer();
		at.setVisible(true);
	}
}
