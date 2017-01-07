package be.geertvanderpijpen.thinkinginjava.exercises.innerclasses;

import static be.geertvanderpijpen.thinkinginjava.utils.Print.*;

interface TimeKeeper {
	void readTime();
}

public class LocalInnerClass {
	
	public TimeKeeper getWatch(){
		class Watch implements TimeKeeper {
			Watch() {
				print("Watch()");
			}
			
			public void readTime() {
				print("Watch.readTime()");
			}
		}
		
		return new Watch();
	}
	
	public TimeKeeper getTimePortal(boolean believer) {
		if(believer) {
			class TimePortal implements TimeKeeper {
				TimePortal() {
					print("TimePortal()");
				}
				
				public void readTime() {
					print("TimePortal.readTime()");
				}
			}
			
			return new TimePortal();
		}
		
		return null;
	}

	public static void main(String[] args) {
		LocalInnerClass lic = new LocalInnerClass();
		TimeKeeper tk = lic.getWatch();
		tk.readTime();
		tk = lic.getTimePortal(true);
		tk.readTime();
		tk =  lic.getTimePortal(false);
		// NullPointerException tk.readTime();
	}

}
