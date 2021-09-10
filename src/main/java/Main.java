import de.re.easymodbus.exceptions.ModbusException;
import de.re.easymodbus.modbusclient.ModbusClient;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException, ModbusException, InterruptedException {
        ModbusClient modbusClient = new ModbusClient("192.168.0.218", 502);
        modbusClient.Connect();

        // Writing Single Coil

        //modbusClient.WriteSingleCoil(1024,true); //Stop
        //modbusClient.WriteSingleCoil(1024,false);
        //modbusClient.WriteSingleCoil(1025,true); //Start
        //modbusClient.WriteSingleCoil(1025,false);
        //modbusClient.WriteSingleCoil(1026,true); //Alarm
        //modbusClient.WriteSingleCoil(1026,false);

        // Writing Holding Reg float
        //modbusClient.WriteMultipleRegisters(1500,ModbusClient.ConvertFloatToTwoRegisters((float)(1323.55))); //sp T


        // Read Input Status
        //System.out.println(Arrays.toString(modbusClient.ReadDiscreteInputs(1024, 1))); // Статус работы






        //Read Float Value from Input Reg
       System.out.println(ModbusClient.ConvertRegistersToFloat(modbusClient.ReadInputRegisters(1572, 2))); // ТОС

        for (int i = 0; i < 24; i++) {

            Writer.write(ModbusClient.ConvertRegistersToFloat(modbusClient.ReadInputRegisters(1572, 2)));
        i++;
            TimeUnit.SECONDS.sleep(1);
        }

    }
}
