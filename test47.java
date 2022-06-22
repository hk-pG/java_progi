import java.awt.*;
import java.awt.event.*;

public class test47 extends Frame implements TextListener {
	public static void main(String[] args) {
		new test47();
	}

	@Override
	public void textValueChanged(TextEvent e) {
		TextField tf = (TextField) e.getSource();
		System.out.println(tf.getText());
	}

	test47() {
		super("TextListenerTest");
		TextField tf1 = new TextField();
		tf1.addTextListener(this);
		add(tf1);
		setSize(200, 100);
		setVisible(true);
	}
}