package package03_BuilderPattern;

class GeneralParams{
	    Integer ii;       Float ff;          String ss;        Double dd;         Boolean ee;          Short st;           Long ll;
	
	public GeneralParams(	Integer ii,Float ff,String ss,Double dd,Boolean ee,Short st,Long ll){
		super();
		this.ii    = ii;     this.ff    = ff;  this.ss   = ss;   this.dd  = dd;     this.ee   = ee;       this.st    = st;     this.ll     = ll;
	}
	
	@Override
	public String toString() {
		return "GeneralParams [ii=" + ii + ", ff=" + ff + ", ss=" + ss + ", dd=" + dd + ", ee=" + ee + ", st=" + st + ", ll=" + ll + "]";
	}
	
}

class GeneralParamsBuilder{
    Integer ii;       Float ff;          String ss;        Double dd;         Boolean ee;          Short st;           Long ll;

	public GeneralParamsBuilder setIi(Integer ii) {
		this.ii = ii;          return this;
	}
	public GeneralParamsBuilder setFf(Float ff) {
		this.ff = ff;         return this;
	}
	public GeneralParamsBuilder setSs(String ss) {
		this.ss = ss;        return this;
	}
	public GeneralParamsBuilder setDd(Double dd) {
		this.dd = dd;      return this;
	}
	public GeneralParamsBuilder setEe(Boolean ee) {
		this.ee = ee;       return this;
	}
	public GeneralParamsBuilder setSt(Short st) {
		this.st = st;         return this;
	}
	public GeneralParamsBuilder setLl(Long ll) {
		this.ll = ll;           return this;
	}
	
	public GeneralParams builsGeneralParams(){
		return new GeneralParams(ii,ff,ss,dd,ee,st,ll);
	}
}


public class Example01_Basic {

	public static void main(String[] args) {
		GeneralParams gp = new GeneralParamsBuilder()
				.setDd(20.2)
				.setEe(true)
				.setFf(0.5f)
				.setIi(100)
				.setLl(60l)
				.setSs("Architect")
				.setSt((short)5)
				.builsGeneralParams();
        System.out.println(gp);
        
		GeneralParams gpOptional = new GeneralParamsBuilder()
				.setDd(20.2)
//				.setEe(true)    // optional
//				.setFf(0.5f)    // optional
//				.setIi(100)    // optional
//				.setLl(60l)    // optional
//				.setSs("Architect")    // optional
				.setSt((short)5)
				.builsGeneralParams();
        System.out.println(gpOptional);
	}

}
