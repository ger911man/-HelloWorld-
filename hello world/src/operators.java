/*******************************
+
-
*
/
% delenie po modulu(ostatok ot deleniya)  18%8=2 =/=8*2+2=16+2
++
+=
-=
*=
/=
%=
--
*******************************/
public class operators {
	public static void main(String[] args){
		double i=65,post,pref,res;
		post=pref=0;
		res=i%8;
		
		System.out.println(res);
		System.out.println("post="+(post++)+" pref=" +(++pref));
		System.out.println("post="+post+" pref=" +pref);
		
	}
}
