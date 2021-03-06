package com.topsun.posclient.finance.ui.view;

import java.util.Calendar;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import com.topsun.posclient.common.POSClientApp;
import com.topsun.posclient.common.POSException;
import com.topsun.posclient.common.service.IBaseService;
import com.topsun.posclient.common.service.impl.BaseServiceImpl;
import com.topsun.posclient.datamodel.User;
import com.topsun.posclient.finance.ui.table.IncomeInfoContentProvider;
import com.topsun.posclient.finance.ui.table.IncomeInfoLableProvider;
import com.topsun.widget.calendar.CalendarCombo;

public class DisbursementView extends ViewPart {
	User loginUser = POSClientApp.get().getLoginUser();
	IBaseService commonService  = new BaseServiceImpl();
	
	Combo category = null;//类别
	Text shopName = null;//店铺名称
	Combo feeType = null;//费用类型
	Combo payee = null; //收款人
	Text orderNumber = null;//单据编号
	CalendarCombo paymentDate = null;//收款日期
	CalendarCombo checkDate = null; //审核日期
	Text deptmentName = null; //部门
	Text remark  = null; //备注
	
	public CalendarCombo startDate;
	public CalendarCombo endDate;
	
	public TableViewer disbursementViewer;
	public DisbursementView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		buildBaseInfo(parent);
		buildDisbursemenInfo(parent);

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
	
	private void buildDisbursemenInfo(Composite parent){
		Group productInfo = new Group(parent, SWT.NONE);
		productInfo.setText("收款信息");
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginLeft = 20;
		productInfo.setLayout(gridLayout);
		GridData data = new GridData(GridData.FILL_BOTH);
		productInfo.setLayoutData(data);
		disbursementViewer = new TableViewer(productInfo);
		disbursementViewer.setContentProvider(new IncomeInfoContentProvider());
		disbursementViewer.setLabelProvider(new IncomeInfoLableProvider());
		
		Table table = disbursementViewer.getTable();
		{
			GridData tableData = new GridData(GridData.FILL_HORIZONTAL);
			tableData.heightHint = 300;
			table.setLayoutData(tableData);
			table.setHeaderVisible(true);
			table.setLinesVisible(false);
		}
		
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("收款方式");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("收款金额");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("银行名称");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("银行帐号");
		}
		{
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth(80);
			column.setText("备注");
		}

	}
	
	private void buildBaseInfo(Composite parent) {

		Group baseInfo = new Group(parent, SWT.NONE);

		baseInfo.setText("基本信息");
		GridLayout gridLayout = new GridLayout(2, false);
		gridLayout.marginLeft = 30;
		baseInfo.setLayout(gridLayout);
		baseInfo.setLayoutData(new GridData(GridData.FILL_BOTH));

		Composite leftComposite = new Composite(baseInfo, SWT.NONE);
		leftComposite.setLayout(new GridLayout(4, false));
		leftComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

		Composite rightCompoiste = new Composite(baseInfo, SWT.NONE);
		rightCompoiste.setLayout(new GridLayout(4, false));
		rightCompoiste.setLayoutData(new GridData(GridData.FILL_BOTH));

		Composite underCompsite = new Composite(baseInfo, SWT.NONE);
		underCompsite.setLayout(new GridLayout(4, false));
		GridData data2 = new GridData(GridData.FILL_BOTH);
		data2.horizontalSpan = 2;
		underCompsite.setLayoutData(data2);
		{
			Label label = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("类别");
		}
		{
			category = new Combo(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.widthHint = 185;
			data.horizontalSpan = 3;
			category.setLayoutData(data);
//			String loginShopName = loginUser.getDeptName();
			category.setItems(new String[] { "" });
			category.setEnabled(false);
			category.select(0);
		}
		{
			Label label = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			label.setLayoutData(data);
			label.setText("店铺");
		}
		{
			shopName = new Text(leftComposite, SWT.BORDER);
			GridData data = new GridData();
			data.widthHint = 200;
			data.horizontalSpan = 3;
			shopName.setLayoutData(data);
			shopName.setEditable(false);
			shopName.setText(loginUser.getDeptName());
		}
		{
			Label lable = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("费用类型");
		}
		{
			feeType = new Combo(leftComposite, SWT.NONE);
			feeType.setEnabled(false);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 185;
			feeType.setLayoutData(data);
		
			feeType.setItems(new String[] { "" });
			feeType.select(0);
		}
		{
			Label lable = new Label(leftComposite, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("收款人");
		}
		{
			payee = new Combo(leftComposite, SWT.BORDER|SWT.READ_ONLY);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.widthHint = 185;
			payee.setLayoutData(data);
			String userName = loginUser.getUserName();
			payee.setItems(new String[] {userName });
			payee.select(0);
		}
		{
			Label lable = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("单据编号");
		}
		{
			String no = "";
			try {
				no = commonService.createNo();
			} catch (POSException e1) {
			}
			orderNumber = new Text(rightCompoiste, SWT.BORDER);
			orderNumber.setEditable(false);
			GridData data = new GridData();
			data.widthHint = 200;
			data.horizontalSpan = 3;
			orderNumber.setLayoutData(data);
			orderNumber.setText(no);
		}
		{
			Label lable = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("收款日期");
		}
		{
			paymentDate = new CalendarCombo(rightCompoiste, SWT.READ_ONLY,
					new Settings(), null);
			paymentDate.setDate(Calendar.getInstance());
			paymentDate.setEnabled(false);
			GridData data = new GridData();
			data.widthHint = 210;
			data.horizontalSpan = 3;
			paymentDate.setLayoutData(data);
		}
		
		{
			Label lable = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("审核日期");
		}
		{
			checkDate = new CalendarCombo(rightCompoiste, SWT.READ_ONLY,
					new Settings(), null);
			checkDate.setDate(Calendar.getInstance());
			checkDate.setEnabled(false);
			GridData data = new GridData();
			data.widthHint = 210;
			data.horizontalSpan = 3;
			checkDate.setLayoutData(data);
		}
		
		{
			Label lable = new Label(rightCompoiste, SWT.NONE);
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
			lable.setText("部门");
		}
		{
			deptmentName = new Text(rightCompoiste,SWT.BORDER);
			deptmentName.setEnabled(false);
			GridData data = new GridData();
			data.widthHint = 200;
			data.horizontalSpan = 3;
			deptmentName.setLayoutData(data);
			deptmentName.setText(loginUser.getDeptName());
		}

		{
			Label lable = new Label(underCompsite, SWT.NONE);
			lable.setText("备注");
			GridData data = new GridData();
			data.horizontalSpan = 1;
			lable.setLayoutData(data);
		}
		{
			remark = new Text(underCompsite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalSpan = 3;
			data.heightHint = 40;
			data.widthHint = 740;
			remark.setLayoutData(data);
		}

	}

}
