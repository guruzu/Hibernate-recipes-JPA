/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch4;

import java.util.List;

import com.hibernaterecipes.annotations.dao.DiscDAO;
import com.hibernaterecipes.annotations.domain.AudioDisc_1;
import com.hibernaterecipes.annotations.domain.AudioDisc_2;
import com.hibernaterecipes.annotations.domain.Disc_1;
import com.hibernaterecipes.annotations.domain.Disc_2;
import com.hibernaterecipes.annotations.domain.VideoDisc_1;
import com.hibernaterecipes.annotations.domain.VideoDisc_2;

/**
 * @author Guruzu  
 *
 */
public class Launch4_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		try {
			
			DiscDAO dao = new DiscDAO();
			
			List<Disc_2> list = dao.readAllDisc_2();
			if(list != null)
			{
				for(Disc_2 order:list)
				{
					System.out.println(order);
					
				}
			}//
			System.out.println("********************");
			List<AudioDisc_2> list_1 = dao.readAllAudioDisc_2();
			if(list_1 != null)
			{
				for(AudioDisc_2 order:list_1)
				{
					System.out.println(order);
					
				}
			}
			System.out.println("********************");
			List<VideoDisc_2> list_2 = dao.readAllVideoDisc_2();
			if(list_2 != null)
			{
				for(VideoDisc_2 order:list_2)
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
