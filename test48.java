import java.awt.*;
import java.awt.event.*;

/**
 * test48
 */
public class test48 extends Frame implements ItemListener {
	test48() {
		super("ItemListenerTest");
		Checkbox cb1 = new Checkbox("CB1");
		cb1.addItemListener(this);
		add(cb1);
		setSize(200, 100);
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			System.out.println("SELECTED");
		} else if (e.getStateChange() == ItemEvent.DESELECTED) {
			System.out.println("DESELECTED");
		}
	}

	public static void main(String[] args) {
		new test48();
	}
}