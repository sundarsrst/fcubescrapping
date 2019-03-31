package fcubescrapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FcubeScrapper {
	public static void main(String[] args) throws Exception {
		 Document document = Jsoup.connect("http://www.fcubecinemas.com/").userAgent("Mozilla").get();
		 Elements temp=document.select("div.shows-list");
		 String[] marvel=new String[19];
		 int i=0;
		 for (Element movielist:temp){
			 marvel[i]=movielist.getElementsByTag("a").first().text();
			 i++;
			 }
		 	 for(i=0;i<marvel.length;i++) {
			 System.out.println(marvel[i]);
			 if ((marvel[i].equals("Avengers: Infinity War :IN ..."))) {
					 System.out.println("booking has freaking opened, nigga!!!");
					 break;
					 }
					 else {
						 System.out.println(" ");
						 }
					 }
				 }
				 //System.out.println(arr[i].toString());
			 }
	
		
		   
	
		

			 


			
		 
	
	


