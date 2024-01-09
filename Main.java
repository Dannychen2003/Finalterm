package StarWar_1110410059;

public class Main {

	public static void main(String[] args) 
	{
		AirCraft a1=new TieFighter("雙離子引擎生產線星際戰鬥機",6.3,1200,"4100G","SFS P-s4 雙離子引擎","無",1,"SFS L-s1型雷射加農炮", "SFSL-s1型雷射加農炮",1000,1000);
		AirCraft a2=new XWing("Incom Corporation T65B X-Wing Space Superiority Fighter ",12.5,1050,"100MGL","80MGLT","Class 1 Koensayr R300-H 之超空間飛行引擎","Taim & Bak KX9 雷射加農炮"," Taim & Bak KX9 雷射加農炮", 
				"Taim & Bak KX9 雷射加農炮","Taim & Bak KX9 雷射加農炮", 
				"Krupx MG7 質子魚雷發射器","Krupx MG7 質子魚雷發射器");
    a1.toString();
    a2.toString();
	}

}
