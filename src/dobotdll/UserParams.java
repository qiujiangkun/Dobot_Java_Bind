package dobotdll;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * Test<br>
 * <i>native declaration : line 361</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class UserParams extends Structure {
	/** C type : float[8] */
	public float[] params = new float[8];
	public UserParams() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("params");
	}
	/** @param params C type : float[8] */
	public UserParams(float params[]) {
		super();
		if ((params.length != this.params.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.params = params;
	}
	public UserParams(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends UserParams implements Structure.ByReference {
		
	};
	public static class ByValue extends UserParams implements Structure.ByValue {
		
	};
}
