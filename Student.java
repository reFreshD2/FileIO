public class Student {
private String FIO; // 40 ��������
private String subject; // 20 ��������
private int mark; // 1 ������

	public Student() {}
	
	public boolean isCorrect(String info) {
		String[] part = info.split(",");
		if((part[0].trim().length()<=40) && (part[1].trim().length()<=20) && (part[2].trim().length() == 1)) {
			return true;
		}
		return false;
		}
	
	public Student setInfo(String info) {
		String[] part = info.split(",");
			this.FIO = part[0].trim();
			this.subject = part[1].trim();
			this.mark = Integer.parseInt(part[2].trim());
			return this;
	}
	
	public String getString() {
		String result = new String();
		String table1 = new String();
		String table2 = new String();
		for (int i = 0; i < 40 - this.FIO.length(); i++) {
			table1 = table1 + " ";
		}
		for (int i = 0; i < 20 - this.subject.length(); i++) {
			table2 = table2 + " ";
		}
		table1 = table1 + "|";
		table2 = table2 + "|";
		result = this.FIO + table1 + this.subject + table2 + this.mark + "|";
		return result;
	}
}
