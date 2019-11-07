package automaticAttendance.users;

final class Proctor extends Faculty implements Debarr{

  @Override //Proctee specific
  public List getAttendance(){
    return list;
  }

  private Report genReport(){
    return report;
  }

  private void messageParent(){
    return;
  }
  public List getDebarrList() {
    return list;
  }
  public Object getDebarrStaus() {
    return Object;
  }

}
