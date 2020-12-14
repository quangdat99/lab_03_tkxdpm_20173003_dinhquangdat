package media;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import com.oms.bean.Media;

import abstractdata.ADataListPane;
import abstractdata.ADataPageController;
import abstractdata.ADataSinglePane;
import abstractdata.IDataManageController;
import editdialog.BookEditDialog;

@SuppressWarnings("serial")
public class AdminMediaListPane extends ADataListPane<Media>{
	
	
	BookEditDialog dialog;
	IDataManageController<Media> managerController;
	
	public AdminMediaListPane(ADataPageController<Media> controller) {
		this.controller = controller;
	}
	

	@Override
	public void decorateSinglePane(ADataSinglePane<Media> singlePane) {
//		JSpinner spin = new JSpinner();
//		spin.setModel(new SpinnerNumberModel(1, 0, null, 1));
//		singlePane.addDataHandlingComponent(spin);
//		spin.setPreferredSize(new Dimension(100, 20));
		
		JButton button = new JButton("Edit");
		singlePane.addDataHandlingComponent(button);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				if (controller instanceof AdminMediaPageController) {
//					;
//				}
				dialog = new BookEditDialog(singlePane.getData(), managerController);
				
			}
		});
	}
}
