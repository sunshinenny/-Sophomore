// JavaScript Document

function cheackPsw() {
	var divn1 = document.getElementById('div1');
	var divn2 = document.getElementById('div2');
	if (input.password1.value == "") {
		divn1.style.display = "block";
		divn2.style.display = "none" ;//成功
		alert("请输入密码");
		return false;
	} else {
		divn1.style.display = "none";
		divn2.style.display = "block";
		return true;
	}
}

function cheackPassword() {
	if (input.password1.value == input.password2.value) {
		return true;
	} else {
		alert("请检查密码是否正确");
		return false;
	}
}

function cheackName() {
	if (input.name.value == "") {
		alert("请输入姓名");
		return false;
	} else {
		return true;
	}
}

function cheackJieshao() {
	if (input.jieshao.value == "") {
		alert("请输入个人介绍");
		return false;
	} else {
		return true;
	}
}


function cheackYanzhengma() {
	if (input.yanzhengma.value == "") {
		alert("请输入验证码");
		return false;
	} else {
		return true;
	}
}


function cheackForm() {
	//			if(input.password1.value=="123"){
	//			   return false;
	//			   }

	//			可以多个if 按照顺序排，可以实现从上往下检查
	//			现实中有一些网页在最后才出现提示，这个用户友好度不是很好

	//			和检查密码的联动
	if (cheackPsw()) return true;
	if (cheackPassword()) return true;
	if (cheackName()) return true;
	if (cheackJieshao()) return true;
	if (cheackYanzhengma()) return true;

	return false;
}

function $(ID) {
	return document.getElementById(ID);
}
var cityList = new Array();
cityList['北京市'] = ['东城区', '西城区', '昌平区'];
cityList['河北省'] = ['保定', '石家庄', '定州', '廊坊'];
cityList['江苏省'] = ['南京市', '苏州市', '无锡市'];
cityList['浙江省'] = ['杭州市', '宁波市', '温州市'];
cityList['四川省'] = ['四川省', '成都市'];
cityList['海南省'] = ['海口市'];

function changeCity() {
	var province = $("selProvince").value;
	var city = $("selCity");
	city.options.length = 0;
	for (var i in cityList) {
		if (i == province) {
			for (var j in cityList[i]) {
				city.add(new Option(cityList[i][j], cityList[i][j]), null);
			}
		}
	}
}

function allCity() {
	var province = $("selProvince");
	for (var i in cityList) {
		province.add(new Option(i, i), null);
	}
}

window.onload = allCity;
