
package cn.conac.observer.example3;
/**o
 * 真正的读者，为了简单就描述一下姓名
 */
public class Reader implements Observer{
	/**
	 * 读者的姓名
	 */
	private String name;

	public void update(String content) {
		//这是采用推的方式
		System.out.println(name+"收到报纸了，阅读先。推模型 内容是==="+content);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
