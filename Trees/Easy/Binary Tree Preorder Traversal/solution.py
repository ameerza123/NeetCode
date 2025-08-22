# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        res = [] # Store node traversal order
        
        # Recursive function traversing from
        # Root -> Left -> Right
        def preorder(node):
            if not node: # Empty tree or reached final node
                return     
            res.append(node.val)
            preorder(node.left)
            preorder(node.right)
        preorder(root)

        return res