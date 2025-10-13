class RunnerClass{
    public static void main(String[] args) {
    Television t=new Television("LG", true, 55, 1200);
t.changeChannel(211);
        new Headphones("Sony", true, 'O', 349.99f, 3245678998L);
        new Camera("Canon", true, 20, 2500, 'S');
  Speaker s =new Speaker("Bose", (byte)7, 'O', 499.99f, 6677889900L);
s.adjustVolume();
        new AirConditioner("Hitachi", (byte)24, 'S', 1500.0f, 2233445566L);
    }
}