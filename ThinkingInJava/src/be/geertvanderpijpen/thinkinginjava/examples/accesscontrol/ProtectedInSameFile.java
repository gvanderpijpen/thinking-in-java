package be.geertvanderpijpen.thinkinginjava.examples.accesscontrol;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

class LocalProtected{
	protected String memberString = "MEMBER STRING OF THE LOCAL PROTECTED CLASS";
}

public class ProtectedInSameFile {

	public static void main(String[] args) {
		LocalProtected lp = new LocalProtected();
		print(lp.memberString);
	}

}
