// Inserting 'z' at the back
  	v.push_back('z');
  
  	// Inserting 'c' at index 1
  	v.insert(v.begin() + 1, 'c');
      // Deleting last element 'z'
  	v.pop_back();
  
  	// Deleting element 'f'
  	v.erase(find(v.begin(), v.end(), 'f'));
  	
     // Declares vector with given size
    // and fills it with a value
    vector<int> v2(3, 5);  

int main() {

    vector<vector<int>>matrix={
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    cout<<"Traversing 2D vector using index-based loop:\n";
    
    // Traversing using index-based for loop
    for(int i=0;i<matrix.size();i++){
        for(int j=0;j<matrix[i].size();j++){
            cout<<matrix[i][j]<<" ";
        }
        cout<<endl;
    }
    return 0;
}

//list
auto it = l.begin();
advance(it, 2);       // move iterator 2 steps

l.insert(it, 100);

