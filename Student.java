public class Student {
private String FIO; // 40 символов
private String subject; // 20 символов
private int mark; // 1 символ

	public Student() {}
	
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
