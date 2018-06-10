package dobotdll;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : line 325</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class EMotor extends Structure {
	public byte index;
	public byte isEnabled;
	public int speed;
	public EMotor() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("index", "isEnabled", "speed");
	}
	public EMotor(byte index, byte isEnabled, int speed) {
		super();
		this.index = index;
		this.isEnabled = isEnabled;
		this.speed = speed;
	}
	public EMotor(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends EMotor implements Structure.ByReference {
		
	};
	public static class ByValue extends EMotor implements Structure.ByValue {
		
	};
}