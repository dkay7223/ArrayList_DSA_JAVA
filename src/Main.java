import java.util.Random;
import java.util.Scanner;

public class Main {

    private GenericArrayList<Contact> allContacts;


    public GenericArrayList<Contact> getAllContacts() {
        return allContacts;
    }

    public void setAllContacts(GenericArrayList<Contact> allContacts) {
        this.allContacts = allContacts;
    }




    Main(){
    allContacts=new GenericArrayList<Contact>();
}


    public static int getUserSelection() {

        while (true) {

            System.out.println("\n\nTELEPHONE DIRECTORY MANAGEMENT SYSTEM");
            System.out.println(" 1 : Insert Contact ");
            System.out.println(" 2 : Delete Contact ");
            System.out.println(" 3 : View Contact ");
            System.out.println(" 4 : Update Contact ");
            System.out.println(" 5 : Sort Contact ");
            System.out.println(" 6 : Search Contact ");
            System.out.println("     Enter Choice \n\n");

            Scanner input = new Scanner(System.in);

            int opt = input.nextInt();

            if (opt == 1) {
                return 1;
            }
            if (opt == 2) {
                return 2;
            }
            if (opt == 3) {
                return 3;
            }
            if (opt == 4) {
                return 4;
            }
            if (opt == 5) {
                return 5;
            }
            if (opt == 6) {
                return 6;
            }

            return 0;

        }


    }




    public static void main(String args[]) {

        Main M=new Main();
        Scanner input = new Scanner(System.in);

        int opt;
        while ((opt = getUserSelection()) != 0) {
            switch(opt)

            {
                case 1 :
                    Contact sus=new Contact();
                    System.out.println("Enter  first Name : ");
                    String firstName = input.next();
                    System.out.println("Enter  Last Name : ");
                    String lastName =  input.next();
                    Random randID = new Random();
                    int ID = randID.nextInt(1000) + 9999;
                    System.out.println("Enter  PhoneNumber : ");
                    String phoneNumber = input.next();
                    System.out.println("Enter  Mobile Number : ");
                    String mobileNumber = input.next();
                    System.out.println("Enter Email : ");
                    String emailAddress = input.next();
                    System.out.println("Enter Residential Address : ");
                    String residentialAddress = input.next();
                    System.out.println("Enter Your Date of Birth (DD-MM-YYYY) ");
                    String dateOfBirth = input.next();
                    System.out.println("Enter  City : ");
                    String cityName = input.next();
                    System.out.println("Enter Country : ");
                    String countryName = input.next();
                    System.out.println("Enter Website ");
                    String website = input.next();
                    System.out.println("Enter the Company Name : ");
                    String companyName = input.next();

                    sus.setFName(firstName);
                    sus.setLName(lastName);
                    sus.setId(ID);
                    sus.setPhoneNumber(phoneNumber);
                    sus.setCityName(cityName);
                    sus.setAddress(emailAddress);
                    sus.setCountryName(countryName);
                    sus.setEmailAddress(emailAddress);
                    sus.setWebsite(website);
                    sus.setMobile(mobileNumber);
                    sus.setCompany(companyName);
                    sus.setDob(dateOfBirth);

                    M.getAllContacts().add(sus);
                    break;


                case 2 :
                {
                    System.out.println(" 1 : Search By Name ");
                    System.out.println(" 2 : Search By ID ");
                    System.out.println("     Enter Choice");
                    int option = input.nextInt();
                    if(option == 1)
                    {
                        System.out.println("First Name of the Suscriber You want to Delete ");
                        String name = input.next();
                        M.getAllContacts().sortbyName();
                        int i = M.getAllContacts().searchByName(name);
                        if(i != -1)
                        {
                            M.getAllContacts().remove(i);
                            break;
                        }
                        else if (i == -1)
                        {
                            System.out.println("Suscriber not in the Directory");
                            break;
                        }
                    }
                    else if(option == 2)
                    {

                        System.out.println("ID of the Record You want to Delete ");
                        int id = input.nextInt();
                        M.getAllContacts().sortbyID();
                        int index = M.getAllContacts().searchbyID(id);
                        if(index != -1)
                        {
                            M.getAllContacts().remove(index);
                            break;
                        }
                        else if (index == -1)
                        {

                            System.out.println("Suscriber not Found");
                            break;
                        }

                    }
                    else {
                        System.out.println(" Invalid Choice ");
                    }
                }
                break;

                case 3 :

                    M.getAllContacts().displayAll();

                    break;


                //Updating a Record
                case 4 :
                {
                    System.out.println(" 1 : Search By Name ");
                    System.out.println(" 2 : Search By ID ");
                    System.out.println("     Enter Choice");
                    int option = input.nextInt();
                    if(opt == 1)
                    {
                        System.out.println("Enter the First Name of the Suscriber to Update ");
                        String searchName = input.next();
                        M.getAllContacts().sortbyName();
                        int index = M.getAllContacts().searchByName(searchName);

                        if(index != -1)
                        {
                            M.getAllContacts().update(index);
                            break;
                        }

                        else if (index == -1)
                        {

                            System.out.println(" ''Record Not Found'' ");
                            break;
                        }

                    }

                    else if(opt == 2)
                    {

                        System.out.println("ID of the Record You want to Update ");
                        int searchID = input.nextInt();
                        M.getAllContacts().sortbyID();
                        int index = M.getAllContacts().searchbyID(searchID);
                        if(index != -1)
                        {
                            M.getAllContacts().update(index);
                            break;
                        }
                        else if (index == -1)
                        {
                            System.out.println(" ''Record Not Found'' ");
                            break;
                        }
                    }
                    else {
                        System.out.println("Invalid Choice");
                    }
                }

                break;

                case 5 :
                {
                    System.out.println(" 1 : Search By Name ");
                    System.out.println(" 2 : Search By ID ");
                    System.out.println("     Enter Choice");
                    int option = input.nextInt();
                    if(option == 1)
                    {
                        M.getAllContacts().sortbyName();
                    }
                    else if(option == 2)
                    {
                        M.getAllContacts().sortbyID();
                    }
                    else {

                        System.out.println(" Invalid Choice ");
                    }

                }

                break;

                case 6 :
                {
                    System.out.println(" 1 : Search By Name ");
                    System.out.println(" 2 : Search By ID ");
                    System.out.println("     Enter Choice");
                    int option = input.nextInt();
                    if(option == 1)
                    {
                        System.out.println("First Name of the Suscriber You want to Search ");
                        String searchName = input.next();
                        M.getAllContacts().sortbyName();
                        int i = M.getAllContacts().searchByName(searchName);
                        if(i != -1)
                        {
                            M.getAllContacts().displaySpecific(i);
                            break;
                        }
                        else if (i == -1)
                        {

                            System.out.println(" Suscriber not Found ");
                            break;
                        }

                    }
                    else if(option == 2)
                    {
                        System.out.println(" ID of the Record to Search ");
                        int id = input.nextInt();
                        M.getAllContacts().sortbyID();
                        int i = M.getAllContacts().searchbyID(id);
                        if(i != -1)
                        {
                            M.getAllContacts().displaySpecific(i);
                            break;
                        }

                        else if (i == -1)
                        {
                            System.out.println(" ''Record Not Found'' ");
                            break;
                        }
                    }
                    else {
                        System.out.println(" ''OOPS ! You Entered Wrong Choice'' ");
                    }
                }
                break;
                default  :
                {
                    System.out.println(" Invalid Choice ");
                }

            }

        }
    }
}