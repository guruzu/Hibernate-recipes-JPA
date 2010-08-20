/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch4;

import java.util.List;

import com.hibernaterecipes.annotations.dao.DiscDAO;
import com.hibernaterecipes.annotations.domain.AudioDisc_1;
import com.hibernaterecipes.annotations.domain.Disc_1;
import com.hibernaterecipes.annotations.domain.VideoDisc_1;

/**
 * @author Guruzu  
 *
 */
public class Launch4_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		try {
			
			DiscDAO dao = new DiscDAO();
			
			List<Disc_1> list = dao.readAll();
			if(list != null)
			{
				for(Disc_1 order:list)
				{
					System.out.println(order);
					
				}
			}//
			System.out.println("********************");
			List<AudioDisc_1> list_1 = dao.readAllAudioDisc();
			if(list_1 != null)
			{
				for(AudioDisc_1 order:list_1)
				{
					System.out.println(order);
					
				}
			}
			System.out.println("********************");
			List<VideoDisc_1> list_2 = dao.readAllVideoDisc();
			if(list_2 != null)
			{
				for(VideoDisc_1 order:list_2)
				{
					System.out.println(order);
					
				}
			}
			
			System.out.println("THE END");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
