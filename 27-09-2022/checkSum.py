'''

    ******************** 500 DAYS CODING CHALLENGE *****************************
    @ AUTHOR : Ariharasudhan
    @ DATE : 27/09/2022
    @ Problem Statement : A checksum is used to verify if a post has not been tampered.
	The checksum of a post is the 5 most frequent characters in the text of a post,
	with ties broken by alphabetic order. For each post, compute and display the checksum.

'''

class CheckSumZoho:
	def sort(self,s):
		s = [x for x in s]
		for x in range(len(s)):
			for y in range(x+1,len(s)):
				if s[x]>s[y]:
					tem = s[y]
					s[y] = s[x]
					s[x] = tem
		for x in s:
			if x==" ":
				s.remove(x)
		return "".join(s)

	def find(self,s):
		if len(s)<5:
			s = self.sort(s)
			print(s)
		else:
			d = {}
			s = self.sort(s.lower())
			for x in s:
				if x==" ":
					s.remove(x)
			l2,l1 = [],[]
			for x in s:
				if x in d:
					d[x]+=1
				else:
					d[x]=1
			for x in d:
				if d[x]==1:
					l2.append(x)
				else:
					l1.append(x)
			strres = "".join(l1)+"".join(l2)		
			print(strres[:5])

CheckSumZoho().find("HelloWorld")
