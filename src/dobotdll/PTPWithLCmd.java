package dobotdll;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : line 167</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class PTPWithLCmd extends Structure {
	public byte ptpMode;
	public float x;
	public float y;
	public float z;
	public float r;
	public float l;
	public PTPWithLCmd() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("ptpMode", "x", "y", "z", "r", "l");
	}
	public PTPWithLCmd(byte ptpMode, float x, float y, float z, float r, float l) {
		super();
		this.ptpMode = ptpMode;
		this.x = x;
		this.y = y;
		this.z = z;
		this.r = r;
		this.l = l;
	}
	public PTPWithLCmd(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PTPWithLCmd implements Structure.ByReference {
		
	};
	public static class ByValue extends PTPWithLCmd implements Structure.ByValue {
		
	};
}
