/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch4;

import com.hibernaterecipes.annotations.dao.DiscDAO;
import com.hibernaterecipes.annotations.domain.AudioDisc_4;
import com.hibernaterecipes.annotations.domain.VideoDisc_4;

/**
 * @author Guruzu  
 *
 */
public class Launch4_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		try {
			
			DiscDAO dao = new DiscDAO();
			AudioDisc_4 aDisc = new AudioDisc_4();
			aDisc.setName("Again 4_4_1");
			aDisc.setNoOfSongs(7);
			aDisc.setPrice(9);
			aDisc.setSinger("MJ");
			dao.createAudioDisc_4(aDisc);
			
			VideoDisc_4 vDisc = new VideoDisc_4();
			vDisc.setName("AgainVideo 4_1");
			vDisc.setDirector("MJ");
			vDisc.setLanguage("English");
			vDisc.setPrice(20);
			dao.createVideoDisc_4(vDisc);
			
			System.out.println("THE END");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
