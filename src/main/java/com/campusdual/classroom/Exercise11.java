package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        blackRemote.turnOn();//Encender tele
        System.out.println("TV encendida con el mando color " + blackRemote.getColor());
        blackRemote.channelUp();
        System.out.println("Se ha subido un canal");
        blackRemote.channelDown();
        System.out.println("Se ha bajado un canal");
        blackRemote.volumeUp();
        System.out.println("Se ha subido el volumen");
        blackRemote.volumeDown();
        System.out.println("Se ha bajado el volumen");
        blackRemote.turnOff();
        System.out.println("TV encendida con el mando color " + blackRemote.getColor());

    }

}