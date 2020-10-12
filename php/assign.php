<?php

	// Numeric Array
	$arr1 = array(7,8,9,10,11);
	foreach ($arr1 as $i) {
	    echo $i.' ';
	}
	echo '<br>';

	// Associative Array
	$arr2 = array("a"=>100,"b"=>200,"c"=>300);
	echo $arr2['a'].' ';
	echo $arr2['b'].' ';
	echo $arr2['c'].' ';
	echo '<br>';
	
	// Functions - Calling by value

	function addNum($a, $b) {
	    $c = $a + $b;
	    return $c;
	     
	}

	function dispSum($u, $v) {
		$d = addNum($u,$v);
		echo 'Sum is '.$d;
	    echo '<br>';
	}

	function increment($c) {
		return $c +1;
	}
	
	addNum(2,3);


	//Functions - Calling by reference

	function swap(&$x, &$y) {
		$t = $x;
		$x = $y;
		$y = $t;
	}

	$j = 9;
	$k = 8;

	echo $j." , ".$k;
	echo '<br>';
	swap($j,$k);
	echo $j." , ".$k;
	echo '<br>';




?>
