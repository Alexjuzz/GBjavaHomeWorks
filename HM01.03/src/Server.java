import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        Stuff ivan = new Director("Директор",10000,"Иван","Петров",30,12);
        Stuff oleg = new Accounter("Бухгалтер",20000,"Олег","Иванов",40,"Microsoft");
        Stuff anton = new Worker("Механик",15000,"Антон","Сидоров",27);
        Company businessCo = new Company();
        businessCo.listAdd(ivan);
        businessCo.listAdd(oleg);
        businessCo.listAdd(anton);
        try (ServerSocket serverPart = new ServerSocket(666)){
            System.out.println("Сервер запущен... Ожидаем подключение клиента...");
            Socket serverInterface = serverPart.accept();
            System.out.println("Клиент произвёл подключение...");
            DataOutputStream infoOut = new DataOutputStream(serverInterface.getOutputStream());
            DataInputStream infoIn = new DataInputStream(serverInterface.getInputStream());

            while (true){
                String clientRequest = infoIn.readUTF();

                if(clientRequest.equals("Стоп")) break;
                if(Integer.parseInt(clientRequest)==1){
                    infoOut.writeUTF("Введите ID сотрудника... ");
                    int idNum = Integer.parseInt(infoIn.readUTF());
                    for (Stuff id: businessCo) {
                        if(idNum==id.getId()){
                            infoOut.writeUTF(id.getInfo()+"\nЧто требуется сделать?\n[1] Посмотреть сотрудника; [2] Удалить сотрудника;" +
                                    "[3] Добавить сотрудника; [4] Посмотреть список сотрудников");
                        }
                    }


                } else if (Integer.parseInt(clientRequest)==2) {
                    infoOut.writeUTF("Введите ID сотрудника для удаления... ");
                    int idNum = Integer.parseInt(infoIn.readUTF());

                            businessCo.removeStuff(idNum);
                            infoOut.writeUTF("Удален");



                } else if (Integer.parseInt(clientRequest)==3) {
                    infoOut.writeUTF("Введите должность сотрудника");
                    String scanPosition = infoIn.readUTF();
                    infoOut.writeUTF("Введите имя сотрудника");
                    String scanFirstName = infoIn.readUTF();
                    infoOut.writeUTF("Введите фамилию сотрудника");
                    String scanSecondName = infoIn.readUTF();
                    infoOut.writeUTF("Введите зарплату сотрудника");
                    int scanSalary = Integer.parseInt(infoIn.readUTF());
                    infoOut.writeUTF("Введите возраст сотрудника");
                    int scanAge = Integer.parseInt(infoIn.readUTF());
                    businessCo.listAdd(new Stuff(scanPosition,scanSalary,scanFirstName,scanSecondName,scanAge));
                    infoOut.writeUTF("Добавлен сотрудник: "+scanFirstName+" "+scanSecondName+"\nЧто требуется сделать?\n[1] Посмотреть сотрудника; [2] Удалить сотрудника;" +
                            "[3] Добавить сотрудника; [4] Посмотреть список сотрудников");
                } else if (Integer.parseInt(clientRequest)==4) {
                    StringBuilder listPer = new StringBuilder();
                    for (Stuff it: businessCo) {
                        listPer.append(it.getInfo()).append("\n");
                    }
                    infoOut.writeUTF(listPer+"\nЧто требуется сделать?\n[1] Посмотреть сотрудника; [2] Удалить сотрудника;"+
                            "[3] Добавить сотрудника; [4] Посмотреть список сотрудников");
                }
                else {
                    infoOut.writeUTF("Некорректный ввод!!!\nЧто требуется сделать?\n[1] Посмотреть сотрудника; [2] Удалить сотрудника;"+
                            "[3] Добавить сотрудника; [4] Посмотреть список сотрудников");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
