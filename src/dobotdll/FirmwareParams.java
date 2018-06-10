package dobotdll;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : line 380</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class FirmwareParams extends Structure {
	public byte mode;
	public FirmwareParams() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("mode");
	}
	public FirmwareParams(byte mode) {
		super();
		this.mode = mode;
	}
	public FirmwareParams(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends FirmwareParams implements Structure.ByReference {
		
	};
	public static class ByValue extends FirmwareParams implements Structure.ByValue {
		
	};
}