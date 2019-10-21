
public class MesoAsciiCal extends MesoAsciiAbstract {
	
	private String stID;
	
	public MesoAsciiCal(MesoStation meso) {
		//TODO: Finish 
		stID = meso.getStID();
	}
	
	public double asciiValue(String word) {
		double tot_val = 0;
		int val = 0;
		for(int index=0; index < 4; index++) {
			char character = (word.charAt(index)); //Finds character at index
			val = (int) character; // Gets ascii value 
			tot_val += val; //Adds 
		}
		return (tot_val/4); 
	}
	
	@Override
	public int calAverage() {
		int[] avg_list = new int[3];
		double ascii = asciiValue(stID);
		avg_list[0] =  (int) Math.ceil(ascii);
		avg_list[1] = (int) Math.floor(ascii);
		if(asciiValue(stID)%(int)ascii < 0.5) {
			avg_list[2] = (int) Math.floor(ascii);
		}
		else {
			avg_list[2] = (int) Math.ceil(ascii);
		}
		
		return avg_list[2];  //Return only the average value
	}
}