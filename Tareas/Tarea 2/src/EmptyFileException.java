import javax.swing.JOptionPane;

public class EmptyFileException extends Exception{
	public EmptyFileException(String msg) {
		super(msg);
	}
}
