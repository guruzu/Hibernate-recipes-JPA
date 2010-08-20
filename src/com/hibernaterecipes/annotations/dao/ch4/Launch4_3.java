/**
 * 
 */
package com.hibernaterecipes.annotations.dao.ch4;

import com.hibernaterecipes.annotations.dao.DiscDAO;
import com.hibernaterecipes.annotations.domain.AudioDisc_3;

/**
 * @author Guruzu  
 *
 */
public class Launch4_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		try {
			
			DiscDAO dao = new DiscDAO();
			/*AudioDisc_3 aDisc = new AudioDisc_3();
			aDisc.setName("Again");
			aDisc.setNoOfSongs(6);
			aDisc.setPrice(9);
			aDisc.setSinger("MJ");
			dao.createAudioDisc_3(aDisc);*/
			dao.readAllAudioDisc_3();
			System.out.println("THE END");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
