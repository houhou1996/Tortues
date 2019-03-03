package pobj.tme6;

public class Substitution {
	
	static public ICommand substitute(ICommand org, ICommand subst) {
		SubstituionSaveTurtle s = new SubstituionSaveTurtle(subst);
		org.execute(s);
		return s.getCommand();
	}
}
