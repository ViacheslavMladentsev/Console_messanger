package edu.school21.sockets.schemasMessaging.toServer;

import edu.school21.sockets.schemasMessaging.RoomSchema;
import lombok.Getter;


@Getter
public class MessageRoomInfoToServer extends MessageToServerBase {

    RoomSchema roomInfo;

    public MessageRoomInfoToServer(String itemMenu, RoomSchema roomInfo) {
        super(itemMenu);
        this.roomInfo = roomInfo;
    }
}
