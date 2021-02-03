package case_study.Controllers.Manager;

import case_study.Commons.ReadAndWrite.WriteAndReadBooking;
import case_study.Commons.ReadAndWrite.WriteAndReadCustomer;
import case_study.Commons.ReadAndWrite.WriteAndReadService;
import case_study.Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageBooking {
    static Scanner scanner = new Scanner(System.in);
    public static void addBooking(){
        Booking booking = new Booking();
        List <Booking> listBooking = new ArrayList<>();
        List <Customer> listCustomer = WriteAndReadCustomer.customerRead();
        ManageCustomer.showInformationCustomer();
        int chooseCus;
        do {
            System.out.println("Enter to choose number of customer");
            chooseCus = Integer.parseInt(scanner.nextLine());
            if (!(chooseCus <= 0) || chooseCus-1 >= listCustomer.size()) {
                break;
            }
            System.err.println("Please choose number 1 to " + listCustomer.size());
        }while (true);
        booking.setNameCustomer(listCustomer.get(chooseCus-1).getCustomerName());
        booking.setCustomerIdNumber(listCustomer.get(chooseCus-1).getCustomerIdNumber());
        System.out.println("1. Booking Villa\n" +
                "2. Booking House\n" +
                "3. Booking Room\n" +
                "4. Exit\n" +
                "Select one service you want to book: ");
        int chooseService = Integer.parseInt(scanner.nextLine());
        switch (chooseService){
            case 1:
                List <Villa> listVilla = WriteAndReadService.readVilla();
                ManageVilla.showVilla();
                int chooseVilla = Integer.parseInt(scanner.nextLine());
                booking.setIdService(listVilla.get(chooseVilla-1).getId());
                break;
            case 2:
                List <House> listHouse = WriteAndReadService.readHouse();
                ManageHouse.showHouse();
                int chooseHouse = Integer.parseInt(scanner.nextLine());
                booking.setIdService(listHouse.get(chooseHouse-1).getId());
                break;
            case 3:
                List <Room> listRoom = WriteAndReadService.readRoom();
                ManageRoom.showRoom();
                int chooseRoom = Integer.parseInt(scanner.nextLine());
                booking.setIdService(listRoom.get(chooseRoom-1).getId());
                break;
            case 4:
                break;
        }
        listBooking.add(booking);
        WriteAndReadBooking.writeBooking(listBooking,true);
    }

//    public static void showBooking(){
//        List <Booking> list = WriteAndReadBooking.readBooking();
//        int count = 1;
//        for (Booking booking : list){
//            System.out.println(count++ + booking.showInfor());
//        }
//    }
}
