package media;

import javax.swing.JLabel;

import com.oms.bean.Book;
import com.oms.bean.Media;
import com.oms.bean.PhysicalMedia;

@SuppressWarnings("serial")
public class BookSinglePane extends PhysicalMediaSinglePane {
	private JLabel Publisher;
	private JLabel Publication;
	private JLabel Authors;
	private JLabel NumberOfPages;
	private JLabel Language;
	
	public BookSinglePane() {
		super();
	}
	
	public BookSinglePane(Media media) {
		this();
		this.t = media;

		displayData();
	}
	
	@Override
	public void buildControls() {
		super.buildControls();
		
		int row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		Publisher = new JLabel();
		add(Publisher, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		Publication = new JLabel();
		add(Publication, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		Authors = new JLabel();
		add(Authors, c);

		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		NumberOfPages = new JLabel();
		add(NumberOfPages, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		Language = new JLabel();
		add(Language, c);
	}
	
	
	@Override
	public void displayData() {
		super.displayData();
		if (t instanceof Book) {
			Book book = (Book) t;
		Publisher.setText("ManhDS_20173253-Publisher: " + book.getPublisher());
		Publication.setText("ManhDS_20173253-Publication: " + book.getPublicationDate());
		Authors.setText("ManhDS_20173253-Authors: " + book.getAuthors());
		NumberOfPages.setText("ManhDS_20173253-NumberOfPages: " + book.getNumberOfPages());
		Publication.setText("ManhDS_20173253-Publication: " + book.getCategory());
		Authors.setText("ManhDS_20173253-Language: " + book.getLanguage());
		}
	}
}
