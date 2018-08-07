package Utilites;

import java.io.IOException;

import GameSession.Player;


public class MancalaServerSocket extends java.net.ServerSocket {

    public MancalaServerSocket(int i) throws IOException {
        super(i);
    }

    public Player acceptPlayer() throws IOException {
        Player socket = new Player();
        this.implAccept(socket);
        socket.createStreams();
        return socket;
    }
}
