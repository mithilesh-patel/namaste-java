package StringBuilder;

public class SB2 {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		System.out.println("StringBuilder capacity on initialization"+sb.capacity());
		sb.append("Mithilesh");
		System.out.println("StringBuilder capacity on appending a string"+ sb.capacity());
		System.out.println(sb.length());
		System.out.println("StringBuilder capacity on appending a string"+ sb.capacity());
		sb.append("Mithilesh Kumar Patel");
		System.out.println("StringBuilder capacity on appending a string"+ sb.capacity());
        
		// Capacity increases as --> New Capacity = (Current Capacity × 2) + 2
		
		
		
		System.out.println(sb); // MithileshMithilesh Kumar Patel
		
		// StringBuilder Methods
		// delete(int start, int end)
		// deleteCharAt(int index)
		
		sb.insert(5, 'K');
		sb.delete(0, 9);
		sb.deleteCharAt(0);
		sb.reverse();
		String FinalName= sb.toString();
		System.out.println(sb);
		System.out.println(FinalName);
		
		
	}

}
