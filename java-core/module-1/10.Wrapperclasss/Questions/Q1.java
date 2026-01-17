// each datatype into their respective classes
class Q1{
	public static void main(String[] args) {
		int aa =12;
		Integer i = aa;
		System.out.println("implicit int:"+i);
		Integer j = Integer.valueOf(aa);
		System.out.println("explicit int:  "+j);
		byte bb = 97;
		Byte k = bb;
		System.out.println("implicit byte: "+k);
		Byte l = Byte.valueOf(bb);
		System.out.println("explicit byte: "+l);
		short cc = 13;
		Short m = cc;
		System.out.println("implicit short: "+m);
		Short n = Short.valueOf(cc);
		System.out.println("Explicit short: "+n);
		char dd = 'f';
		Character o=dd;
		System.out.println("implicit char: "+o);
		Character p = Character.valueOf(dd);
		System.out.println("explicit char: "+p);
		boolean ee = true;
		Boolean q = ee;
		System.out.println("implicit boolean: "+q);
		Boolean r = Boolean.valueOf(ee);
		System.out.println("explicit boolean: "+r);
		double ff = 12.345;
		Double s = ff;
		System.out.println("implicit double: "+s);
		Double t = Double.valueOf(ff);
		System.out.println("explicit double: "+t);
	    float gg = 12.345f;
		float u = gg;
		System.out.println("implicit float: "+u);
		Double v = Double.valueOf(gg);
		System.out.println("explicit float: "+v);


	}
}