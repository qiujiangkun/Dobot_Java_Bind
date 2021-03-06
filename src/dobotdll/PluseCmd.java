package dobotdll;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : line 437</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class PluseCmd extends Structure {
	public float j1;
	public float j2;
	public float j3;
	public float j4;
	public float e1;
	public float e2;
	public PluseCmd() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("j1", "j2", "j3", "j4", "e1", "e2");
	}
	public PluseCmd(float j1, float j2, float j3, float j4, float e1, float e2) {
		super();
		this.j1 = j1;
		this.j2 = j2;
		this.j3 = j3;
		this.j4 = j4;
		this.e1 = e1;
		this.e2 = e2;
	}
	public PluseCmd(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PluseCmd implements Structure.ByReference {
		
	};
	public static class ByValue extends PluseCmd implements Structure.ByValue {
		
	};
}
