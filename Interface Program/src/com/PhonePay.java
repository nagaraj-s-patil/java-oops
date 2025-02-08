package com;

interface PhonePay {
	
	void payAmount();
}

interface Uber extends PhonePay{
	
	void bookCab();
}
