package com.neotech.lesson34;

public class Recap {

	public static void main(String[] args) {

		// The most important about exceptions is HANDLE THE EXECPTION HOW -->

		// TRY AND CATCH -->
		// 1 in TRY we need to put the code we want to execute in case of exception
		// 2 CATCH --> Shows the user (you or someone else what happened )
		// 3 WE pit inside of the Try Block any code that depends on the line

		// ------------------------------------------------------------------------------

		// We can handle exceptions properly with TRY CATCH
		// Or just pass the responsibility to the user in this case you or the user.

		// -- > here is an example of that

		String str = "Hello";

		try {

			// throw an exception
			System.out.println("Full str --> " + str);

			char h = str.charAt(4);
			System.out.println(h);

			int a = 10;
			int b = 0;

			System.out.println(a / b);

		}

		// Here we can use the exceptions --> we can use different exceptions

		// --> StringIndexOutOfBoundsException sio
		// -- > This exception allows you to get the message the exception will give you
		// -- > sio has --> sio.getMessage());
		// --> sio has also -->
		// --> You can also can print any message after that
		// --> sio.getStackTrace();

//		catch (StringIndexOutOfBoundsException sio) {
//			sio.getMessage();
//			sio.getStackTrace();
//		}
//
//		// also we do have another catch
//		// ArithmeticException ae
//		catch (ArithmeticException ae) {
//			System.out.println(ae);
//			System.out.println("Please do not divide by 0! ");
//		}

		// This last catch is part of the last exception we can implement in the code
		// To ensure we can catch if there is anything that will not
		// be caught for any reason
		// printStackTrace() will print the error in a friendly way
		catch (Exception e) {
			e.printStackTrace();
			e.getMessage(); // --> and then we can get the error message

		}

		System.out.println("end fo the code");

	}

	// The most important here is to understand as well each catch will be execute
	// just one line of code

}
