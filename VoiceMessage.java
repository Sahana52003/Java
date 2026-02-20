class VoiceMessage extends Message
{
public void throughAudio(){
System.out.println("Hi, this is Ram....");
}
public static void main(String[] args){
Message msg=new VoiceMessage();
msg.sendMessages();
VoiceMessage voicemsg=(VoiceMessage)msg;
voicemsg.throughAudio();
voicemsg.sendMessages();
Message message=new TextMessage();
message.sendMessages();
TextMessage txtmsg=(TextMessage)message;
txtmsg.sendText();
}
}