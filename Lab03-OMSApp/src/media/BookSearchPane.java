package media;

import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class BookSearchPane extends PhysicalMediaSearchPane {

	private JTextField publisherField;
	private JTextField languageField;
	
	
	public BookSearchPane() {
		super();
	}
	
	
	@Override
	public void buildControls() {
		super.buildControls();
		JLabel publisherLabel = new JLabel("ManhDS_20173253-Publisher");
		publisherField = new JTextField(15);
		int row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		add(publisherLabel, c);
		c.gridx = 1;
		c.gridy = row;
		add(publisherField, c);
		
		
		JLabel languageLabel = new JLabel("ManhDS_20173253-Language");
		languageField = new JTextField(15);
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		add(languageLabel, c);
		c.gridx = 1;
		c.gridy = row;
		add(languageField, c);
	}
	
	@Override
	public Map<String, String> getQueryParams() {
		Map<String, String> res = super.getQueryParams();
		
		if (!publisherField.getText().trim().equals("")) {
			res.put("publisher", publisherField.getText().trim());
		}
		if (!languageField.getText().trim().equals("")) {
			res.put("language", languageField.getText().trim());
		}
		
		return res;
	}

}
