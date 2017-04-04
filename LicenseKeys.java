package programming.assignment.License.Keys.Simple;

import java.util.Scanner;

public class LicenseKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Software Key");
		Scanner input = new Scanner(System.in);
		String softwareKey =  input.nextLine();
		System.out.println("Enter the length of key");
		int lengthOfKey = input.nextInt();
		String refinedSoftwareKey = refiningSoftwareKey(softwareKey,lengthOfKey);
		System.out.println("Software Key=: " + refinedSoftwareKey);
		input.close();
	}

	public static String refiningSoftwareKey(String softwareKey, int lengthOfKey) {
		// TODO Auto-generated method stub
		StringBuffer result = new StringBuffer("");
		int j=0;
		for(int i = 0 ;i< softwareKey.length(); i++ ){
			if(softwareKey.charAt(i)!='-'){
				result.append(softwareKey.charAt(i));
				j++;
			}
			if(j%lengthOfKey==0 && j!=0 ) {
				if(softwareKey.charAt(i)!='-' && i != softwareKey.length()-1){
					result.append("-");
				}
			}
		}
		return result.toString().toUpperCase();
	}

}
