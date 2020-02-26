package Epam.hometask_5;
import java.util.Scanner;
import Epam.hometask_5.ConstructionCost.*;
import Epam.hometask_5.Interest.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("unused")
public class Menu {

	 static Logger log = LogManager.getLogger(Menu.class.getName());
	public static void main(String[] args) {
		log.info("Choose 1 to Interest Evaluator 2 to Construction Cost Evaluator ");
		System.out.println("Hi");
		Scanner scan=new Scanner(System.in);
		double choice=scan.nextDouble();
		do {
		if(choice==1)
		Interest.interestEvaluator();
		if(choice==2)
        ConstructionCost.costEvaluator(); 
		
	}while(choice>0&&choice<3);
	}
}