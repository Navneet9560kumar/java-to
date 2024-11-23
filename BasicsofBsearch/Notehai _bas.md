It is use to search  a give element in a sorted space (array)
but is ke real  dafination is [😎 it is use to reduse the searchspach in half after every tern  ] This is orginall diffision for interview
2=>  Usallly we apply B.S when it is given that it is a shprted (kahi bhi shorted aa jaye to ) 

this is efficent but why what ?🤔🤔🤔🤔


arr = {10,15,21,34,81,105,180,500};
 target = 81 ;

 ab isko ham linear shearch se kar kaskte hai per aasa karne se T.C band jati hai O(n) ho jati hai
 3 => agr unshorted hai to sssch bhi sakte hai per shorted hai to need nahi hai hamko linear lagage hamko TC kam karne ke leye binary bhi lagane padh sakti hai 


 to ab ham shoudo code likhte hai jo arry de rakha hai usame ab dekhge 

 if(arr[mid]<target)go right
 else if (arr[mid]>taget) go left
 else if(arr[mid]==target) done 
  to dekho ye B.S kaam karta hai 


  😎😎😎😎 ab algo karte hai 

  target 21  => {10,15,21,34,81,105,180,500,641}
  so do seen hoga lo 0 index per or high ko last index per 
pehle hee flag bana lenge 
bollena flag = true ;

while(lo<=high>){
      int mid = (lo + hig)/2; ab mid beech mai aa gaya or us se sabko compare karege ke badha chhota dekhge 
      if(arr[mid]<target)
      else if(arr[mid>target])  to ham hige = mid-1;
      

}


 to  aasa seen hai ke ab ham lower bond nekal rahe hai or lower bound ka real matalb ye hota hai ke {Smalest idx sach that arr[idx]>=x}

 so example is is 
 arr = {10,20,30,30,40,50,60,70}
 to bhai ab x =40 hai to lower bonud fond karna hai idx 4 per or lower bond 4  hai 🤔🤔🤔🤔
 agr 40 exited hee na karta ho to ya element bar bar aate ho to jase 30 to [L.B kay hoga 2 ya 3 ] to lower bond a 2 hoga in case of 30

 matalb ye hai seddha  seedah ke jitaen bhi nuber extis kar rahe ho multiple to ye sabse chhota index hee lower bound hoga 

 A=> ab case jo ho hee na jase 25 to ek badha hoga usko LW bolege 
 B=> or jase 80 mana ye hai hee nahi or next index bhi nahi dekh sakte to total arr 8 size ka usko hee ans de dete hai 

 C=> or sabe chhota number leya jaye jase 5 to ye bhi nahi or chhota to LW is 0 



 4 => ab same hai per arr[idx]>x bas baki sab same 