class Solution {
    public boolean isIdentical(Node r1, Node r2) {
        if (r1 == null && r2 == null) return true;
              
              // Case 2: Ek null hai aur dusra nahi -> Not Identical
              if (r1 == null || r2 == null)  return false;
              

              // Case 3: Values match karni chahiye AUR subtrees bhi identical hone chahiye
              return (r1.data == r2.data) 
                  && isIdentical(r1.left, r2.left) 
                  && isIdentical(r1.right, r2.right);
          
        
    }
}